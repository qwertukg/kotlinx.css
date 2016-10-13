package org.jetbrains.kotlinx.css

import kotlin.reflect.*

class TagProperty() {
    operator fun getValue(container: StyleContainer, property : KProperty<*>) : Style = container.tag(property.name)
}

val StyleContainer.a: Style by TagProperty()
val StyleContainer.abbr: Style by TagProperty()
val StyleContainer.acronym: Style by TagProperty()
val StyleContainer.address: Style by TagProperty()
val StyleContainer.applet: Style by TagProperty()
val StyleContainer.area: Style by TagProperty()
val StyleContainer.article: Style by TagProperty()
val StyleContainer.aside: Style by TagProperty()
val StyleContainer.audio: Style by TagProperty()
val StyleContainer.b: Style by TagProperty()
val StyleContainer.base: Style by TagProperty()
val StyleContainer.basefont: Style by TagProperty()
val StyleContainer.bdi: Style by TagProperty()
val StyleContainer.bdo: Style by TagProperty()
val StyleContainer.big: Style by TagProperty()
val StyleContainer.blockquote: Style by TagProperty()
val StyleContainer.body: Style by TagProperty()
val StyleContainer.br: Style by TagProperty()
val StyleContainer.button: Style by TagProperty()
val StyleContainer.canvas: Style by TagProperty()
val StyleContainer.caption: Style by TagProperty()
val StyleContainer.center: Style by TagProperty()
val StyleContainer.cite: Style by TagProperty()
val StyleContainer.code: Style by TagProperty()
val StyleContainer.col: Style by TagProperty()
val StyleContainer.colgroup: Style by TagProperty()
val StyleContainer.command: Style by TagProperty()
val StyleContainer.datalist: Style by TagProperty()
val StyleContainer.dd: Style by TagProperty()
val StyleContainer.del: Style by TagProperty()
val StyleContainer.details: Style by TagProperty()
val StyleContainer.dfn: Style by TagProperty()
val StyleContainer.dialog: Style by TagProperty()
val StyleContainer.dir: Style by TagProperty()
val StyleContainer.div: Style by TagProperty()
val StyleContainer.dl: Style by TagProperty()
val StyleContainer.dt: Style by TagProperty()
val StyleContainer.em: Style by TagProperty()
val StyleContainer.embed: Style by TagProperty()
val StyleContainer.fieldset: Style by TagProperty()
val StyleContainer.figcaption: Style by TagProperty()
val StyleContainer.figure: Style by TagProperty()
val StyleContainer.font: Style by TagProperty()
val StyleContainer.footer: Style by TagProperty()
val StyleContainer.form: Style by TagProperty()
val StyleContainer.frame: Style by TagProperty()
val StyleContainer.frameset: Style by TagProperty()
val StyleContainer.head: Style by TagProperty()
val StyleContainer.header: Style by TagProperty()
val StyleContainer.h1: Style by TagProperty()
val StyleContainer.h2: Style by TagProperty()
val StyleContainer.h3: Style by TagProperty()
val StyleContainer.h4: Style by TagProperty()
val StyleContainer.h5: Style by TagProperty()
val StyleContainer.h6: Style by TagProperty()
val StyleContainer.hr: Style by TagProperty()
val StyleContainer.html: Style by TagProperty()
val StyleContainer.i: Style by TagProperty()
val StyleContainer.iframe: Style by TagProperty()
val StyleContainer.img: Style by TagProperty()
val StyleContainer.input: Style by TagProperty()
val StyleContainer.ins: Style by TagProperty()
val StyleContainer.kbd: Style by TagProperty()
val StyleContainer.keygen: Style by TagProperty()
val StyleContainer.label: Style by TagProperty()
val StyleContainer.legend: Style by TagProperty()
val StyleContainer.li: Style by TagProperty()
val StyleContainer.link: Style by TagProperty()
val StyleContainer.map: Style by TagProperty()
val StyleContainer.mark: Style by TagProperty()
val StyleContainer.menu: Style by TagProperty()
val StyleContainer.meta: Style by TagProperty()
val StyleContainer.meter: Style by TagProperty()
val StyleContainer.nav: Style by TagProperty()
val StyleContainer.noframes: Style by TagProperty()
val StyleContainer.noscript: Style by TagProperty()
val StyleContainer.ol: Style by TagProperty()
val StyleContainer.optgroup: Style by TagProperty()
val StyleContainer.option: Style by TagProperty()
val StyleContainer.output: Style by TagProperty()
val StyleContainer.p: Style by TagProperty()
val StyleContainer.param: Style by TagProperty()
val StyleContainer.pre: Style by TagProperty()
val StyleContainer.progress: Style by TagProperty()
val StyleContainer.q: Style by TagProperty()
val StyleContainer.rp: Style by TagProperty()
val StyleContainer.rt: Style by TagProperty()
val StyleContainer.ruby: Style by TagProperty()
val StyleContainer.s: Style by TagProperty()
val StyleContainer.samp: Style by TagProperty()
val StyleContainer.script: Style by TagProperty()
val StyleContainer.section: Style by TagProperty()
val StyleContainer.select: Style by TagProperty()
val StyleContainer.small: Style by TagProperty()
val StyleContainer.source: Style by TagProperty()
val StyleContainer.span: Style by TagProperty()
val StyleContainer.strike: Style by TagProperty()
val StyleContainer.strong: Style by TagProperty()
val StyleContainer.style: Style by TagProperty()
val StyleContainer.sub: Style by TagProperty()
val StyleContainer.summary: Style by TagProperty()
val StyleContainer.sup: Style by TagProperty()
val StyleContainer.table: Style by TagProperty()
val StyleContainer.tbody: Style by TagProperty()
val StyleContainer.td: Style by TagProperty()
val StyleContainer.textarea: Style by TagProperty()
val StyleContainer.tfoot: Style by TagProperty()
val StyleContainer.th: Style by TagProperty()
val StyleContainer.thead: Style by TagProperty()
val StyleContainer.time: Style by TagProperty()
val StyleContainer.title: Style by TagProperty()
val StyleContainer.tr: Style by TagProperty()
val StyleContainer.track: Style by TagProperty()
val StyleContainer.tt: Style by TagProperty()
val StyleContainer.u: Style by TagProperty()
val StyleContainer.ul: Style by TagProperty()
val StyleContainer.video: Style by TagProperty()
val StyleContainer.wbr: Style by TagProperty()