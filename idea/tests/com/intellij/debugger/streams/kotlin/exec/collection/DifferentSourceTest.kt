// Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.debugger.streams.kotlin.exec.collection

/**
 * @author Vitaliy.Bibaev
 */
class DifferentSourceTest : CollectionTestCase("source") {
  fun testCollectionAsSource() = doTestWithResult()
  fun testStringAsSource() = doTestWithResult()
  fun testArrayAsSource() = doTestWithResult()
  fun testPrimitiveArrayAsSource() = doTestWithResult()
}