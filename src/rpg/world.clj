(ns rpg.world
  (:use rpg.player))

(def world 
  (atom {}))

(defn update-world
  "CHANGE THE STATE OF THE ENTIRE WORLD!!!!! BECAREFUL"
  [key, value]
  (def world
    (swap! world assoc key value)))

(defn init-player
  "Get player data and add player to world"
  [name, gender]
  (update-world :player (create-player! name gender)))

(defn init-world
  "Start game"
  []
  (init-player "ash" "male"))

