helllo world with bazel
==============

This is sample java project build with bazel
For more detail information of bazel http://bazel.io/

# Install bazel

This project can be built with Bazel 0.1.1  
See at http://bazel.io/docs/install.html

# Run

## debug mode
```
bazel run :runner
```

or

```
bazel run --define mode=debug :runner
```

## release mode
```
bazel run --define mode=release :runner
```
