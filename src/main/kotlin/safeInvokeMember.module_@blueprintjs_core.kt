@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")


@file:JsModule("@blueprintjs/core")
package com.palantir.blueprintjs

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external fun <T : Any, K : Any, R> safeInvokeMember(obj: T?, key: K): R?

external fun <T : Any, K : Any, A, R> safeInvokeMember(obj: T?, key: K, arg1: A): R?

external fun <T : Any, K : Any, A, B, R> safeInvokeMember(obj: T?, key: K, arg1: A, arg2: B): R?

external fun <T : Any, K : Any, A, B, C, R> safeInvokeMember(obj: T?, key: K, arg1: A, arg2: B, arg3: C): R?