package com.techprimers.configs;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;


@ConfigurationProperties(prefix = "staticprops")
@Data
public class StaticAppConfigs {
	
	private String env;
	private String version;
	private List<String> domainList = new ArrayList<String>();
	private int rootCauseCount;
}
