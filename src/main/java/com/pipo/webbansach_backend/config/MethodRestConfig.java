package com.pipo.webbansach_backend.config;

import com.pipo.webbansach_backend.entity.TheLoai;
import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import java.util.stream.Collectors;

@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {
    private String url = "http://localhost:3000";

    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
//        HttpMethod[] chanCacPhuongThuc = {
//                HttpMethod.POST,
//                HttpMethod.PUT,
//                HttpMethod.PATCH,
//                HttpMethod.DELETE,
//        };
        //expose ids
        // Cho phep id trong khi tra ve json
//        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).collect(Collectors.toList()).toArray(new Class[0]));
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
        // config.exposeIdsFor(TheLoai.class);

//        disableHttpMethods(TheLoai.class, config, chanCacPhuongThuc);
//        HttpMethod[] phuongThucDelete ={
//                HttpMethod.DELETE
//        };
//        disableHttpMethods(TheLoai.class, config, phuongThucDelete);

        //CORS configuration
//        cors.addMapping("/**")
//                .allowedOrigins(url)
//                .allowedMethods("GET","POST","PUT","DELETE");
//    }

//    private void disableHttpMethods(Class c, RepositoryRestConfiguration config, HttpMethod[] methods) {
//        config.getExposureConfiguration()
//                .forDomainType(c)
//                .withAssociationExposure((metdata, httpMethods) -> httpMethods.disable(methods))
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(methods));
    }
}
