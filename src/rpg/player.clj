(ns rpg.player)

(def player 
  { :name   nil 
    :gender nil
    :class  nil })

(defn create-player! 
  "Create new player"
  [name, gender]
  (def player
    (assoc player :name name :gender gender)))

