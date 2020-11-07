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
import React.FormEventHandler
import global.JSX.Element

external interface IControlProps : IProps, HTMLInputProps {
    var alignIndicator: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var checked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var children: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    override var defaultChecked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inputRef: ((ref: HTMLInputElement?) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
    var inline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
    var labelElement: dynamic /* ReactElement__0? | String? | Number? | Any? | ReactNodeArray? | ReactPortal? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var onChange: FormEventHandler<HTMLInputElement>?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: String? /* "a" | "abbr" | "address" | "area" | "article" | "aside" | "audio" | "b" | "base" | "bdi" | "bdo" | "big" | "blockquote" | "body" | "br" | "button" | "canvas" | "caption" | "cite" | "code" | "col" | "colgroup" | "data" | "datalist" | "dd" | "del" | "details" | "dfn" | "dialog" | "div" | "dl" | "dt" | "em" | "embed" | "fieldset" | "figcaption" | "figure" | "footer" | "form" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "head" | "header" | "hgroup" | "hr" | "html" | "i" | "iframe" | "img" | "input" | "ins" | "kbd" | "keygen" | "label" | "legend" | "li" | "link" | "main" | "map" | "mark" | "menu" | "menuitem" | "meta" | "meter" | "nav" | "noindex" | "noscript" | "object" | "ol" | "optgroup" | "option" | "output" | "p" | "param" | "picture" | "pre" | "progress" | "q" | "rp" | "rt" | "ruby" | "s" | "samp" | "slot" | "script" | "section" | "select" | "small" | "source" | "span" | "strong" | "style" | "sub" | "summary" | "sup" | "table" | "template" | "tbody" | "td" | "textarea" | "tfoot" | "th" | "thead" | "time" | "title" | "tr" | "track" | "u" | "ul" | "var" | "video" | "wbr" | "webview" | "svg" | "animate" | "animateMotion" | "animateTransform" | "circle" | "clipPath" | "defs" | "desc" | "ellipse" | "feBlend" | "feColorMatrix" | "feComponentTransfer" | "feComposite" | "feConvolveMatrix" | "feDiffuseLighting" | "feDisplacementMap" | "feDistantLight" | "feDropShadow" | "feFlood" | "feFuncA" | "feFuncB" | "feFuncG" | "feFuncR" | "feGaussianBlur" | "feImage" | "feMerge" | "feMergeNode" | "feMorphology" | "feOffset" | "fePointLight" | "feSpecularLighting" | "feSpotLight" | "feTile" | "feTurbulence" | "filter" | "foreignObject" | "g" | "image" | "line" | "linearGradient" | "marker" | "mask" | "metadata" | "mpath" | "path" | "pattern" | "polygon" | "polyline" | "radialGradient" | "rect" | "stop" | "switch" | "symbol" | "text" | "textPath" | "tspan" | "use" | "view" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ISwitchProps : IControlProps {
    var innerLabelChecked: String?
        get() = definedExternally
        set(value) = definedExternally
    var innerLabel: String?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Switch(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<ISwitchProps> {
    override fun render(): Element

    companion object {
        var displayName: String
    }
}

typealias IRadioProps = IControlProps

external open class Radio(props: P, context: Any = definedExternally) : AbstractPureComponent2__1<IRadioProps> {
    override fun render(): Element

    companion object {
        var displayName: String
    }
}

external interface ICheckboxProps : IControlProps {
    var defaultIndeterminate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var indeterminate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ICheckboxState {
    var indeterminate: Boolean
}

external open class Checkbox(props: P, context: Any = definedExternally) : AbstractPureComponent2__2<ICheckboxProps, ICheckboxState> {
    open var input: Any
    override fun render(): Element
    override var componentDidMount: () -> Unit
    open fun componentDidUpdate()
    open var updateIndeterminate: Any
    open var handleChange: Any
    open var handleInputRef: Any

    companion object {
        var displayName: String
        fun getDerivedStateFromProps(__0: ICheckboxProps): ICheckboxState?
    }
}