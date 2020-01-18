# Scoped constructor injection into fragments, using dagger-android
A POC project to demonstrate scoped dependencies injection into fragments via constructor using dagger-android. You can read more in https://proandroiddev.com/constructor-injection-into-fragments-with-respect-of-scopes-311c0258d678

## Keypoints
The demo consists of two parts:
1. Members injection example (for reference);
2. Constructor injection example.

You can launch any of those parts from the main screen of the demo. After that you'll be presented with an activity, which contains two fragments. Both activity and fragments will print out their dependences: the name and the hashcode - by looking at those you can verify that scoping works properly.

Pressing "re-inflate fragments" button will create new set of fragments and replace the current ones with those.
