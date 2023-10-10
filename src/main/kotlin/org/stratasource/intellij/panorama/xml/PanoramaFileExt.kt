package com.enderzombi102.css.panorama.xml

import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiFile

fun PsiFile.isPanoramaXml(): Boolean =
	viewProvider.virtualFile.isPanoramaXml()

fun VirtualFile.isPanoramaXml(): Boolean =
	extension == "xml" && !fileType.isBinary
