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
import React.CSSProperties
import global.JSX.Element
import React.Component__2

external interface IOverflowListProps<T> : IProps {
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<T>
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var observeParents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onOverflow: ((overflowItems: Array<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var overflowRenderer: (overflowItems: Array<T>) -> dynamic
    var style: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: String? /* "a" | "abbr" | "address" | "area" | "article" | "aside" | "audio" | "b" | "base" | "bdi" | "bdo" | "big" | "blockquote" | "body" | "br" | "button" | "canvas" | "caption" | "cite" | "code" | "col" | "colgroup" | "data" | "datalist" | "dd" | "del" | "details" | "dfn" | "dialog" | "div" | "dl" | "dt" | "em" | "embed" | "fieldset" | "figcaption" | "figure" | "footer" | "form" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "head" | "header" | "hgroup" | "hr" | "html" | "i" | "iframe" | "img" | "input" | "ins" | "kbd" | "keygen" | "label" | "legend" | "li" | "link" | "main" | "map" | "mark" | "menu" | "menuitem" | "meta" | "meter" | "nav" | "noindex" | "noscript" | "object" | "ol" | "optgroup" | "option" | "output" | "p" | "param" | "picture" | "pre" | "progress" | "q" | "rp" | "rt" | "ruby" | "s" | "samp" | "slot" | "script" | "section" | "select" | "small" | "source" | "span" | "strong" | "style" | "sub" | "summary" | "sup" | "table" | "template" | "tbody" | "td" | "textarea" | "tfoot" | "th" | "thead" | "time" | "title" | "tr" | "track" | "u" | "ul" | "var" | "video" | "wbr" | "webview" | "svg" | "animate" | "animateMotion" | "animateTransform" | "circle" | "clipPath" | "defs" | "desc" | "ellipse" | "feBlend" | "feColorMatrix" | "feComponentTransfer" | "feComposite" | "feConvolveMatrix" | "feDiffuseLighting" | "feDisplacementMap" | "feDistantLight" | "feDropShadow" | "feFlood" | "feFuncA" | "feFuncB" | "feFuncG" | "feFuncR" | "feGaussianBlur" | "feImage" | "feMerge" | "feMergeNode" | "feMorphology" | "feOffset" | "fePointLight" | "feSpecularLighting" | "feSpotLight" | "feTile" | "feTurbulence" | "filter" | "foreignObject" | "g" | "image" | "line" | "linearGradient" | "marker" | "mask" | "metadata" | "mpath" | "path" | "pattern" | "polygon" | "polyline" | "radialGradient" | "rect" | "stop" | "switch" | "symbol" | "text" | "textPath" | "tspan" | "use" | "view" */
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: (item: T, index: Number) -> dynamic
}

external interface IOverflowListPropsPartial<T> : IProps {
    var collapseFrom: Any?
        get() = definedExternally
        set(value) = definedExternally
    var items: Array<T>?
        get() = definedExternally
        set(value) = definedExternally
    var minVisibleItems: Number?
        get() = definedExternally
        set(value) = definedExternally
    var observeParents: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onOverflow: ((overflowItems: Array<T>) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var overflowRenderer: ((overflowItems: Array<T>) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var style: CSSProperties?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: String? /* "a" | "abbr" | "address" | "area" | "article" | "aside" | "audio" | "b" | "base" | "bdi" | "bdo" | "big" | "blockquote" | "body" | "br" | "button" | "canvas" | "caption" | "cite" | "code" | "col" | "colgroup" | "data" | "datalist" | "dd" | "del" | "details" | "dfn" | "dialog" | "div" | "dl" | "dt" | "em" | "embed" | "fieldset" | "figcaption" | "figure" | "footer" | "form" | "h1" | "h2" | "h3" | "h4" | "h5" | "h6" | "head" | "header" | "hgroup" | "hr" | "html" | "i" | "iframe" | "img" | "input" | "ins" | "kbd" | "keygen" | "label" | "legend" | "li" | "link" | "main" | "map" | "mark" | "menu" | "menuitem" | "meta" | "meter" | "nav" | "noindex" | "noscript" | "object" | "ol" | "optgroup" | "option" | "output" | "p" | "param" | "picture" | "pre" | "progress" | "q" | "rp" | "rt" | "ruby" | "s" | "samp" | "slot" | "script" | "section" | "select" | "small" | "source" | "span" | "strong" | "style" | "sub" | "summary" | "sup" | "table" | "template" | "tbody" | "td" | "textarea" | "tfoot" | "th" | "thead" | "time" | "title" | "tr" | "track" | "u" | "ul" | "var" | "video" | "wbr" | "webview" | "svg" | "animate" | "animateMotion" | "animateTransform" | "circle" | "clipPath" | "defs" | "desc" | "ellipse" | "feBlend" | "feColorMatrix" | "feComponentTransfer" | "feComposite" | "feConvolveMatrix" | "feDiffuseLighting" | "feDisplacementMap" | "feDistantLight" | "feDropShadow" | "feFlood" | "feFuncA" | "feFuncB" | "feFuncG" | "feFuncR" | "feGaussianBlur" | "feImage" | "feMerge" | "feMergeNode" | "feMorphology" | "feOffset" | "fePointLight" | "feSpecularLighting" | "feSpotLight" | "feTile" | "feTurbulence" | "filter" | "foreignObject" | "g" | "image" | "line" | "linearGradient" | "marker" | "mask" | "metadata" | "mpath" | "path" | "pattern" | "polygon" | "polyline" | "radialGradient" | "rect" | "stop" | "switch" | "symbol" | "text" | "textPath" | "tspan" | "use" | "view" */
        get() = definedExternally
        set(value) = definedExternally
    var visibleItemRenderer: ((item: T, index: Number) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface IOverflowListState<T> {
    var lastOverflowCount: Number
    var overflow: Array<T>
    var visible: Array<T>
}

external open class OverflowList<T> : Component__2<IOverflowListProps<T>, IOverflowListState<T>> {
    open var previousWidths: Any
    open var spacer: Any
    override var componentDidMount: () -> Unit
    open fun shouldComponentUpdate(_nextProps: IOverflowListProps<T>, nextState: IOverflowListState<T>): Boolean
    open fun componentDidUpdate(prevProps: IOverflowListProps<T>, prevState: IOverflowListState<T>)
    override fun render(): Element
    open var maybeRenderOverflow: Any
    open var resize: Any
    open var repartition: Any

    companion object {
        var displayName: String
        var defaultProps: IOverflowListPropsPartial<Any>
        fun <U> ofType(): Any
    }
}