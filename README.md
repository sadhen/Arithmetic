# Arithmetic

## Scala Meetup
Here is the [slides](slides.md) and the corresponding [video](https://www.bilibili.com/video/BV1Qa4y1L7dj) @ 131:00.

## Cheatsheet
```
# Generate the antlr target Java sources
bin/mill antlr4.genAntlr

# Generate for Intellij Idea
bin/mill mill.scalalib.GenIdea/idea

# Run the example module
bin/mill example.run
```

If you have problem downloading the mill binary, you may try my [mirror](https://share.weiyun.com/8Bt4HH6k).
Manually download it and save it to `$HOME/.cache/mill/download`.
