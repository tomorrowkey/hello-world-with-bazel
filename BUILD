config_setting (
  name = "debug",
  values = {
    "define": "mode=debug"
  }
)

config_setting (
  name = "release",
  values = {
    "define": "mode=release"
  }
)

java_binary (
    name = "runner",
    srcs =
      glob(["runner/src/main/**/*.java"]) +
      select({
        ":release": glob(["runner/src/release/java/**/*java"]),
        ":debug":   glob(["runner/src/debug/java/**/*.java"]),
        "//conditions:default": glob(["runner/src/debug/java/**/*.java"]),
        }),
    main_class = "com.example.ProjectRunner",
    deps = [":greeter"],
)

java_library (
    name = "greeter",
    srcs = glob(["greeter/**/*.java"]),
    deps = [":pojobuilder"],
    plugins = [":pojobuilder_plugin"],
)

java_plugin (
    name = "pojobuilder_plugin",
    srcs = glob(["greeter/src/main/java/com.example.lib/model/*.java"]),
    deps = [":pojobuilder"],
    processor_class = "net.karneim.pojobuilder.processor.AnnotationProcessor",
)

java_library (
    name = "pojobuilder",
    exports = [
      "@pojobuilder//jar",
      "@javawriter//jar"
    ],
)
