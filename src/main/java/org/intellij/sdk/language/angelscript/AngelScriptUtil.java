package org.intellij.sdk.language.angelscript;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import org.intellij.sdk.language.angelscript.psi.AngelScriptFile;
import org.intellij.sdk.language.angelscript.psi.AngelScriptVar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AngelScriptUtil {
	public static List<AngelScriptVar> findVars( Project project, String key ) {

		List<AngelScriptVar> result = new ArrayList<>();
		var virtualFiles = FileTypeIndex.getFiles( AngelScriptFileType.INSTANCE, GlobalSearchScope.allScope( project ) );
		for ( var virtualFile : virtualFiles ) {
			var simpleFile = (AngelScriptFile) PsiManager.getInstance( project ).findFile( virtualFile );
			if ( simpleFile != null ) {
				var elements = PsiTreeUtil.getChildrenOfTypeAsList( simpleFile, PsiElement.class );
				for ( var element : elements ) {
					if ( element instanceof AngelScriptVar elementVar ) {
//                      if (key.equals(elementVar.getIdent())) {
						result.add( elementVar );
//                      }
					}
				}
			}
		}
		return result;
	}

	public static List<AngelScriptVar> findVars( Project project ) {
		List<AngelScriptVar> result = new ArrayList<>();
		var virtualFiles = FileTypeIndex.getFiles( AngelScriptFileType.INSTANCE, GlobalSearchScope.allScope( project ) );
		for ( var virtualFile : virtualFiles ) {
			var simpleFile = (AngelScriptFile) PsiManager.getInstance( project ).findFile( virtualFile );
			if ( simpleFile != null ) {
				var elements = PsiTreeUtil.getChildrenOfTypeAsList( simpleFile, PsiElement.class );
				for ( var element : elements ) {
					if ( element instanceof AngelScriptVar ) {
						result.add( (AngelScriptVar) element );
					}
				}
			}
		}
		return result;
	}

	public static List<String> findVars( PsiFile file ) {
		List<String> result = new ArrayList<>();

		if ( file instanceof AngelScriptFile ) {
			var elements = PsiTreeUtil.getChildrenOfTypeAsList( file, PsiElement.class );
			for ( var element : elements ) {
				if ( element instanceof AngelScriptVar ) {
					try {
						String text = element.getFirstChild().getNextSibling().getNextSibling().getText();
						result.add( text );
					} catch ( Exception ignored ) { }
				}
			}
		}
		return result;
	}
}
