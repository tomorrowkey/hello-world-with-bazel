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
    srcs = select({
      ":release": glob(["runner/src/main/**/*.java", "runner/src/release/java/com/example/Environment.java"]),
      ":debug":   glob(["runner/src/main/**/*.java", "runner/src/debug/java/com/example/Environment.java"]),
      "//conditions:default": glob(["runner/src/main/**/*.java", "runner/src/debug/java/com/example/Environment.java"]),
      }),
    main_class = "com.example.ProjectRunner",
    deps = [":greeter"],
)

java_library (
    name = "greeter",
    srcs = glob(["greeter/**/*.java"]),
)