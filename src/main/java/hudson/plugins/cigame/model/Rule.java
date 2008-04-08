package hudson.plugins.cigame.model;

import hudson.model.AbstractBuild;

/**
 * Rule interface.
 *
 * @author Erik Ramfelt
 */
public interface Rule {
	/**
	 * Returns the name of the rule
	 * @return name of the rule
	 */
    String getName();
    
    /**
     * Evaluate the build and return the points for it
     * @param build build to calculate points for
     * @return 0, build is not worth any points and the rule is ignored.
     */
    double evaluate(AbstractBuild<?,?> build);
}