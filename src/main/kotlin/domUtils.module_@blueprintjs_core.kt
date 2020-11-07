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
import React.SyntheticEvent__0

external fun elementIsOrContains(element: HTMLElement, testElement: HTMLElement): Boolean

external fun throttleEvent(target: EventTarget, eventName: String, newEventName: String): (event: Event) -> Unit

external interface IThrottledReactEventOptions {
    var preventDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun <E : SyntheticEvent__0> throttleReactEventCallback(callback: (event: E, otherArgs: Any) -> Any, options: IThrottledReactEventOptions = definedExternally): (event2: E) -> Unit

external fun <T : Function<*>> throttle(method: T): T