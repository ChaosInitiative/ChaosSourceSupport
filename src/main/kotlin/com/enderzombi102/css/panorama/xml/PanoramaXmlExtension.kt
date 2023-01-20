package com.enderzombi102.css.panorama.xml

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiFile
import com.intellij.psi.impl.source.xml.TagNameReference
import com.intellij.psi.xml.XmlDocument
import com.intellij.xml.DefaultXmlExtension
import com.intellij.xml.util.XmlUtil

class PanoramaXmlExtension : DefaultXmlExtension() {
	override fun isAvailable( file: PsiFile ): Boolean =
		super.isAvailable(file)

	override fun createTagNameReference( nameElement: ASTNode, startTagFlag: Boolean ): TagNameReference =
		PanoramaTagNameReference( nameElement, startTagFlag )

	override fun getNamespacesFromDocument( parent: XmlDocument, declarationsExist: Boolean ): Array< Array< String >? >? =
		XmlUtil.getDefaultNamespaces( parent )
}
