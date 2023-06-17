package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {

    @Key("username")
    String getUsername();

    @Key("accessKey")
    String getPassword();

    @Key("remoteUrl")
    String getRemoteUrl();

}