(defproject hello_lwjgl "0.1.0-SNAPSHOT"
  :description "Simple LWJGL clojure test."
  :url "https://github.com/thebusby/hello_lwjgl"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"] 
                 [org.lwjgl.lwjgl/lwjgl "2.9.0"] 
                 [org.lwjgl.lwjgl/lwjgl_util "2.9.0"] 
                 [org.lwjgl.lwjgl/lwjgl-platform "2.9.0" :classifier "natives-osx" :native-prefix ""]]
  :main hello-lwjgl.core
  :aot :all)
