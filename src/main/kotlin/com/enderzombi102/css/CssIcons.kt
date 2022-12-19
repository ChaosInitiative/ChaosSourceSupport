package com.enderzombi102.css

import com.intellij.openapi.util.IconLoader

object CssIcons {
	@JvmField val AS_FILE = icon( "/icons/as.png" )
	@JvmField val SQUIRREL_FILE = icon( "/icons/squirrel.png" )

	fun icon( path: String ) = IconLoader.getIcon( path, CssIcons::class.java )
}
