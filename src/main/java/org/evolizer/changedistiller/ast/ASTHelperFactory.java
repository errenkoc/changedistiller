package org.evolizer.changedistiller.ast;

import java.io.File;

/**
 * Factory interface to create {@link ASTHelper} from a {@link File}.
 * 
 * @author Beat Fluri
 */
public interface ASTHelperFactory {

    /**
     * Creates and returns an {@link ASTHelper} acting on the given {@link File}.
     * 
     * @param file
     *            the AST helper acts on
     * @return the AST helper acting on the file
     */
    @SuppressWarnings("rawtypes")
    ASTHelper create(File file);

}
