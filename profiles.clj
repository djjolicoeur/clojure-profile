{:user {:dependencies [[criterium "0.4.1"]
                       [alembic "0.1.0"]
                       [org.clojure/tools.nrepl "0.2.7"]
                       [datomic-schema-grapher "0.0.1"]}
        :repositories {"my.datomic.com"
                       {:url "https://my.datomic.com/repo"
                        :username "LICENSE EMAIL"
                        :password "PASSWORD"}}
    :plugins [[lein-gnome/lein-template "0.1.0-SNAPSHOT"]
              [lein-midje "3.1.0"]
              [lein-immutant "1.2.3"]
              [lein-pprint "1.1.1"]
              [lein-simpleton "1.3.0"]
              [datomic-schema-grapher "0.0.1"]
              [cider/cider-nrepl "0.9.1"]]}}
