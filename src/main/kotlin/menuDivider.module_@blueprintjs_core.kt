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
import global.JSX.Element
import React.Component__1

external interface IMenuDividerProps : IProps {
    var children: Any?
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external open class MenuDivider : Component__1<IMenuDividerProps> {
    override fun render(): Element

    companion object {
        var displayName: String
    }
}