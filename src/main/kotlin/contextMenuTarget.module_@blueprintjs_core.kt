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
import React.ReactElement__1
import React.MouseEvent__1
import global.JSX.Element
import React.Component__0

external interface IContextMenuTargetComponent : Component__0 {
    override fun render(): ReactElement__1<Any>?
    fun renderContextMenu(e: MouseEvent__1<HTMLElement>): Element?
    val onContextMenuClose: (() -> Unit)?
}

external interface `T$27` {
    var displayName: String
}

external fun <T : IConstructor<IContextMenuTargetComponent>> ContextMenuTarget(WrappedComponent: T): `T$27` /* `T$27` & T */