package jetbrains.buildServer.clouds.kubernetes;

/**
 * Created by ekoshkin (koshkinev@gmail.com) on 07.06.17.
 */
public class KubeContainerEnvironment {
    public static final String AGENT_NAME = "TEAMCITY_KUBERNETES_AGENT_NAME";
    public static final String SERVER_URL = "TEAMCITY_KUBERNETES_SERVER_URL";
    public static final String SERVER_UUID = "TEAMCITY_KUBERNETES_SERVER_UUID";
    public static final String IMAGE_ID = "TEAMCITY_KUBERNETES_IMAGE_NAME";
    public static final String PROFILE_ID = "TEAMCITY_KUBERNETES_CLOUD_PROFILE_ID";
    public static final String INSTANCE_NAME = "TEAMCITY_KUBERNETES_INSTANCE_NAME";

    public static final String OFFICIAL_IMAGE_SERVER_URL = "SERVER_URL";
}
