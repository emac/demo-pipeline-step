package cn.emac.demo.pipeline;

import hudson.Extension;
import org.jenkinsci.plugins.pipelinedsl.PipelineDSLGlobal;
import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.ProxyWhitelist;
import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.StaticWhitelist;

import java.io.IOException;

@Extension
public class Hello2Step extends PipelineDSLGlobal {

    @Override
    public String getFunctionName() {
        return "hello2";
    }

}