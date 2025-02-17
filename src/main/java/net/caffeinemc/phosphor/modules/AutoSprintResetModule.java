package net.caffeinemc.phosphor.modules;

import imgui.type.ImBoolean;
import net.caffeinemc.phosphor.config.OwoConfig;
import net.caffeinemc.phosphor.gui.module.ToggleableModule;
public class AutoSprintResetModule implements ToggleableModule {

    @Override
    public String getName() {
        return "AutoSprintReset";
    }
    @Override
    public String getTabName() {
        return "Combat";
    }
    @Override
    public ImBoolean getToggle(OwoConfig config) {
        return config.getAutoSprintResetEnabled();
    }

}
