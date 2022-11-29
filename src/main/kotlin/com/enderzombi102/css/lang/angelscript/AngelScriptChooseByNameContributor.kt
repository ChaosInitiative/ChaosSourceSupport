package com.enderzombi102.css.lang.angelscript

import com.intellij.navigation.ChooseByNameContributor
import com.intellij.navigation.NavigationItem
import com.intellij.openapi.project.Project

class AngelScriptChooseByNameContributor : ChooseByNameContributor {
	override fun getNames( project: Project, includeNonProjectItems: Boolean ): Array<String> {
		val names: MutableList<String> = ArrayList()
		for ( property in AngelScriptUtil.findVars(project))
			if ( property.ident != null && property.ident.isNotEmpty() )
				names.add(property.ident)

		return names.toTypedArray()
	}

	override fun getItemsByName( name: String, pattern: String, project: Project, includeNonProjectItems: Boolean ): Array<NavigationItem> {
		// FIXME: items external to the project are excluded
		val properties = AngelScriptUtil.findVars(project, name)
		val items: MutableList<NavigationItem> = ArrayList()
		for ( angelScriptVar in properties ) {
			val item = angelScriptVar.navigationElement as NavigationItem
			items.add(item)
		}
		return items.toTypedArray()
	}
}