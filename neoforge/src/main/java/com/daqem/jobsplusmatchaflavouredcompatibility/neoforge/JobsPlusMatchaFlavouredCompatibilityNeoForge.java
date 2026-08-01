package com.daqem.jobsplusmatchaflavouredcompatibility.neoforge;

import com.daqem.jobsplusmatchaflavouredcompatibility.JobsPlusMatchaFlavouredCompatibility;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(JobsPlusMatchaFlavouredCompatibility.MOD_ID)
public class JobsPlusMatchaFlavouredCompatibilityNeoForge {

    public JobsPlusMatchaFlavouredCompatibilityNeoForge(IEventBus modEventBus) {
        JobsPlusMatchaFlavouredCompatibility.init();
    }
}
