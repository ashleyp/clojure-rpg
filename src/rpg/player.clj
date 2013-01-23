(ns rpg.player)

(def player 
  { :name   nil 
    :gender nil
    :class  nil })

(defn update-player
  [key, value]
  (def player
    (assoc player key value)))

(defn create-player! 
  "Create new player"
  [name, gender]
  (update-player :name name)
  (update-player :gender gender))
