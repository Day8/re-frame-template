(ns leiningen.new.options.base
  (:require [leiningen.new.options.helpers :as helpers]))

(defn files [data]
  [[".gitignore" (helpers/render "gitignore" data)]
   ["README.md" (helpers/render "README.md" data)]
   ["project.clj" (helpers/render "project.clj" data)]
   ["shadow-cljs.edn" (helpers/render "shadow-cljs.edn" data)]
   ["package.json" (helpers/render "package.json" data)]
   ["karma.conf.js" (helpers/render "karma.conf.js" data)]
   ["dev/cljs/user.cljs" (helpers/render "dev/cljs/user.cljs" data)]
   ["resources/public/index.html" (helpers/render "resources/public/index.html" data)]
   ["src/cljs/{{sanitized}}/core.cljs" (helpers/render "src/cljs/core.cljs" data)]
   ["src/cljs/{{sanitized}}/config.cljs" (helpers/render "src/cljs/config.cljs" data)]
   ["src/cljs/{{sanitized}}/db.cljs" (helpers/render "src/cljs/db.cljs" data)]
   ["src/cljs/{{sanitized}}/subs.cljs" (helpers/render "src/cljs/subs.cljs" data)]
   ["src/cljs/{{sanitized}}/events.cljs" (helpers/render "src/cljs/events.cljs" data)]])
