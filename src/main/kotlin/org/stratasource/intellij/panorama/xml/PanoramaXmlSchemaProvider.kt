package com.enderzombi102.css.panorama.xml

import com.intellij.openapi.module.Module
import com.intellij.psi.PsiFile
import com.intellij.psi.xml.XmlFile
import com.intellij.xml.XmlSchemaProvider

class PanoramaXmlSchemaProvider : XmlSchemaProvider() {
	override fun isAvailable( file: XmlFile ): Boolean =
		file.isPanoramaXml()

	override fun getSchema( url: String, module: Module?, baseFile: PsiFile ): XmlFile? =
		if ( module != null && baseFile.isPanoramaXml() ) null else null // how to schema
}
