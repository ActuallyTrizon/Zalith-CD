package com.movtery.zalithlauncher.renderer.renderers

import com.movtery.zalithlauncher.renderer.RendererInterface

class NGGl4esRenderer : RendererInterface {
    override fun getRendererId(): String = "opengles2"

    override fun getUniqueIdentifier(): String = "3f8a1c2d-9e47-4b5f-a123-8d7e6f5c4b3a"

    override fun getRendererName(): String = "NG-GL4ES (Krypton)"

    override fun getRendererEnv(): Lazy<Map<String, String>> = lazy { emptyMap() }

    override fun getDlopenLibrary(): Lazy<List<String>> = lazy { emptyList() }

    override fun getRendererLibrary(): String = "libng_gl4es.so"
}
