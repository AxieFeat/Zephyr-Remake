plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "Zephyr"
include(
    "zephyr-core",
    "zephyr-command",
    "zephyr-ui",
    "zephyr-event",
    "zephyr-world",
    "zephyr-i18n",
    "zephyr-item",
    "zephyr-nms",
    "zephyr-nms:zephyr-universe",
    "zephyr-nms:zephyr-1.16.5",
)