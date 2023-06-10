
libraryDependencies ++= Seq(      
    "io.opentelemetry" % "opentelemetry-sdk" % "1.27.0",
    "io.opentelemetry" % "opentelemetry-exporter-prometheus" % "1.20.1-alpha",
    "io.opentelemetry.instrumentation" % "opentelemetry-runtime-metrics" % "1.20.2-alpha",
    "io.opentelemetry.instrumentation" % "opentelemetry-hikaricp-3.0" % "1.20.2-alpha"
)
