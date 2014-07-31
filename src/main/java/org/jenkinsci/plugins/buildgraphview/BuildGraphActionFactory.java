package org.jenkinsci.plugins.buildgraphview;

import hudson.Extension;
import hudson.model.*;
import jenkins.model.Jenkins;

import java.util.Collection;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
 */
@Extension
public class BuildGraphActionFactory extends TransientBuildActionFactory {

	private static final Logger LOGGER = Logger
			.getLogger(BuildGraphActionFactory.class.getName());

	@Override
	public Collection<? extends Action> createFor(AbstractBuild run) {
		LOGGER.log(Level.INFO,
				"Enter BuildGraphActionFactory.createFor() from " + run.getUrl());
		return Collections.singleton(new BuildGraph(run));
	}
}
