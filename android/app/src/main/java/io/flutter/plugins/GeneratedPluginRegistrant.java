package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import fr.g123k.flutterisemulator.FlutterIsEmulatorPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterIsEmulatorPlugin.registerWith(registry.registrarFor("fr.g123k.flutterisemulator.FlutterIsEmulatorPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
