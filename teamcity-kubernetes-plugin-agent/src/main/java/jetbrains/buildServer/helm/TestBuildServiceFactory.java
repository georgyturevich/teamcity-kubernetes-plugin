package jetbrains.buildServer.helm;

import jetbrains.buildServer.agent.AgentBuildRunnerInfo;
import jetbrains.buildServer.agent.BuildAgentConfiguration;
import jetbrains.buildServer.agent.runner.CommandLineBuildService;
import jetbrains.buildServer.agent.runner.CommandLineBuildServiceFactory;
import org.jetbrains.annotations.NotNull;

import static jetbrains.buildServer.helm.HelmConstants.HELM_TEST_RUN_TYPE;

/**
 * Created by Evgeniy Koshkin (evgeniy.koshkin@jetbrains.com) on 18.10.17.
 */
public class TestBuildServiceFactory implements CommandLineBuildServiceFactory {
    @NotNull
    @Override
    public CommandLineBuildService createService() {
        return new TestBuildService();
    }

    @NotNull
    @Override
    public AgentBuildRunnerInfo getBuildRunnerInfo() {
        return new AgentBuildRunnerInfo() {
            @NotNull
            @Override
            public String getType() {
                return HELM_TEST_RUN_TYPE;
            }

            @Override
            public boolean canRun(@NotNull BuildAgentConfiguration buildAgentConfiguration) {
                return true;
            }
        };
    }
}