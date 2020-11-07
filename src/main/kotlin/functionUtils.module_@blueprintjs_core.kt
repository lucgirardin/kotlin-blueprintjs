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

external fun isFunction(value: Any): Boolean

external fun <R> safeInvoke(func: (() -> R)?): R?

external fun <A, R> safeInvoke(func: ((arg1: A) -> R)?, arg1: A): R?

external fun <A, B, R> safeInvoke(func: ((arg1: A, arg2: B) -> R)?, arg1: A, arg2: B): R?

external fun <A, B, C, R> safeInvoke(func: ((arg1: A, arg2: B, arg3: C) -> R)?, arg1: A, arg2: B, arg3: C): R?

external fun <A, B, C, D, R> safeInvoke(func: ((arg1: A, arg2: B, arg3: C, arg4: D) -> R)?, arg1: A, arg2: B, arg3: C, arg4: D): R?

external fun <R> safeInvokeOrValue(funcOrValue: (() -> R)?): R

external fun <R> safeInvokeOrValue(funcOrValue: R?): R

external fun <A, R> safeInvokeOrValue(funcOrValue: ((arg1: A) -> R)?, arg1: A): R

external fun <A, R> safeInvokeOrValue(funcOrValue: R?, arg1: A): R

external fun <A, B, R> safeInvokeOrValue(funcOrValue: ((arg1: A, arg2: B) -> R)?, arg1: A, arg2: B): R

external fun <A, B, R> safeInvokeOrValue(funcOrValue: R?, arg1: A, arg2: B): R

external fun <A, B, C, R> safeInvokeOrValue(funcOrValue: ((arg1: A, arg2: B, arg3: C) -> R)?, arg1: A, arg2: B, arg3: C): R

external fun <A, B, C, R> safeInvokeOrValue(funcOrValue: R?, arg1: A, arg2: B, arg3: C): R

external fun <A, B, C, D, R> safeInvokeOrValue(funcOrValue: ((arg1: A, arg2: B, arg3: C, arg4: D) -> R)?, arg1: A, arg2: B, arg3: C, arg4: D): R

external fun <A, B, C, D, R> safeInvokeOrValue(funcOrValue: R?, arg1: A, arg2: B, arg3: C, arg4: D): R