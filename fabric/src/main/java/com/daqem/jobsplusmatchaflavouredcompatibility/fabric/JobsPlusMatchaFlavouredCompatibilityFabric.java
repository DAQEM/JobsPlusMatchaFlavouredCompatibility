package com.daqem.jobsplusmatchaflavouredcompatibility.fabric;

import com.daqem.jobsplusmatchaflavouredcompatibility.JobsPlusMatchaFlavouredCompatibility;
import net.fabricmc.api.ModInitializer;

public class JobsPlusMatchaFlavouredCompatibilityFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        JobsPlusMatchaFlavouredCompatibility.init();
    }

}
