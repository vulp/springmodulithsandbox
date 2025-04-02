package com.modul.demo;

import com.tngtech.archunit.core.domain.Dependency;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModule;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.core.DependencyType;
import org.springframework.modulith.docs.Documenter;

import java.util.Set;

public class ModularityTest {

    ApplicationModules modules = ApplicationModules.of(DemoApplication.class);

    @Test
    void verifiesModularStructure() {
        modules.verify();
        modules.forEach(System.out::println);
    }

    @Test
    void createModuleDocumentation() {
        ApplicationModules modules = ApplicationModules.of(DemoApplication.class);
        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();

    }



}
