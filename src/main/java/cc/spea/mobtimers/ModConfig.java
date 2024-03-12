package cc.spea.mobtimers;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

import static cc.spea.mobtimers.MobTimers.MOD_ID;

@Config(name = MOD_ID)
class ModConfig implements ConfigData {
    @Comment("Enable")
    boolean enabled = true;
}