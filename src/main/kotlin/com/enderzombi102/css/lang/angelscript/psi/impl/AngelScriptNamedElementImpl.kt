package com.enderzombi102.css.lang.angelscript.psi.impl

import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode
import com.enderzombi102.css.lang.angelscript.psi.AngelScriptNamedElement

abstract class AngelScriptNamedElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), AngelScriptNamedElement