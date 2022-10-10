package com.example.a7minutesworkout

import java.util.Collections.shuffle
import kotlin.collections.ArrayList


class Constants {
    companion object {

        // The drawable images used here are added in the drawable folder.
        /**
         * Here we are adding all exercises to a single list with all the default values.
         */
        fun defaultExerciseList() :ArrayList<ExerciseModel>{

            val exerciseList = ArrayList<ExerciseModel>()

            val jumpingJacks =
                ExerciseModel(1, "Jumping Jacks", R.drawable.ic_jumping_jacks)

            val wallSit = ExerciseModel(2, "Wall Sit", R.drawable.ic_wall_sit)

            val pushUp = ExerciseModel(3, "Push Up", R.drawable.ic_push_up)

            val abdominalCrunch =
                ExerciseModel(4, "Abdominal Crunch", R.drawable.ic_abdominal_crunch)

            val stepUpOnChair =
                ExerciseModel(
                    5,
                    "Step-Up onto Chair",
                    R.drawable.ic_step_up_onto_chair,

                    )

            val squat = ExerciseModel(6, "Squat", R.drawable.ic_squat)

            val tricepDipOnChair =
                ExerciseModel(
                    7,
                    "Tricep Dip On Chair",
                    R.drawable.ic_triceps_dip_on_chair,

                    )

            val plank = ExerciseModel(8, "Plank", R.drawable.ic_plank)

            val highKneesRunningInPlace =
                ExerciseModel(
                    9, "High Knees Running In Place",
                    R.drawable.ic_high_knees_running_in_place,

                    )

            val lunges = ExerciseModel(10, "Lunges", R.drawable.ic_lunge)

            val pushupAndRotation = ExerciseModel(
                11,
                "Push up and Rotation",
                R.drawable.ic_push_up_and_rotation,
            )

            val sidePlank = ExerciseModel(12, "Side Plank", R.drawable.ic_side_plank)

            exerciseList.addAll(
                listOf(
                    jumpingJacks,
                    wallSit,
                    pushUp,
                    abdominalCrunch,
                    stepUpOnChair,
                    squat,
                    tricepDipOnChair,
                    plank,
                    highKneesRunningInPlace,
                    lunges,
                    pushupAndRotation,
                    sidePlank
                )
            )

            shuffle(exerciseList)
            return exerciseList
        }
    }
}
