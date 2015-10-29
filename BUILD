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
)