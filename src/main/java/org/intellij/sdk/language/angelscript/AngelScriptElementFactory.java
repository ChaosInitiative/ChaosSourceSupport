package org.intellij.sdk.language.angelscript;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import org.intellij.sdk.language.angelscript.psi.AngelScriptFile;
import org.intellij.sdk.language.angelscript.psi.AngelScriptIdentifier;

public class AngelScriptElementFactory {
	public static AngelScriptIdentifier createIdentifier( Project project, String name ) {
		return (AngelScriptIdentifier) createFile( project, name ).getFirstChild();
	}

	public static AngelScriptFile createFile( Project project, String text ) {
		return (AngelScriptFile) PsiFileFactory.getInstance( project ).createFileFromText( "dummy.simple", AngelScriptFileType.INSTANCE, text );
	}
}
