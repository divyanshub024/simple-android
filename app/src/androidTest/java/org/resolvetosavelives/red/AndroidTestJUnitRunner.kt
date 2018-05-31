package org.resolvetosavelives.red

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner

/**
 * Runs [TestRedApp] instead of the actual Application class in Android tests.
 * This class is declared in app/build.gradle as the project's default testInstrumentationRunner.
 */
class AndroidTestJUnitRunner : AndroidJUnitRunner() {

  @Throws(InstantiationException::class, IllegalAccessException::class, ClassNotFoundException::class)
  override fun newApplication(cl: ClassLoader, className: String, context: Context): Application {
    return super.newApplication(cl, TestRedApp::class.java.name, context)
  }
}
