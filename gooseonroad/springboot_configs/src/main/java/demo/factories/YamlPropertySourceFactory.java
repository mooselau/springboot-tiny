package demo.factories;

import java.io.IOException;
import java.util.Properties;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;


public class YamlPropertySourceFactory implements PropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(final String s, final EncodedResource encodedResource)
            throws IOException {
        YamlPropertiesFactoryBean factoryBean = new YamlPropertiesFactoryBean();
        factoryBean.setResources(encodedResource.getResource());
        Properties properties = factoryBean.getObject();

        assert properties != null;
        assert encodedResource.getResource().getFilename() != null;

        return new PropertiesPropertySource(encodedResource.getResource().getFilename(), properties);
    }
}
