lazy val root = (project in file("."))
  .enablePlugins(SbtTwirl)
  .settings(TwirlKeys.formatFallback := Some("play.twirl.api.HtmlFormat"))
