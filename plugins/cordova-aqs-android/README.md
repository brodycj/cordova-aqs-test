# cordova-aqs-android

Author: Christopher J. Brody

License: BSD 3-Clause or commercial

I can hereby testify that this project is completely my own work and not subject to agreements with any other parties.
In case of code written under direct guidance from sample code the link is given for reference.
In case I accept contributions from any others I will require CLA with similar statements.
License is subject to change, and this project may be dedicated to the public domain at some point in the future.

## About

Javascript can do XHR query of certain URI(s) starting with `file://aqaq` and receive a callback in the `aqcallback` function. This is similar to the native Android part of [@brodybits / aq-query-test-android](https://github.com/brodybits/aq-query-test-android) working within a Cordova plugin.

This is also tested working from a web worker. This will be used to support sqlite access from a web worker.

## Major tips & tricks

- Specifies configuration in `plugin.xml` to initialize this plugin on startup, THANKS to cordova-plugin-whitelist

## Security TODO(s)

Enforce use of secret bridge code, like the Cordova framework does.

## Other major limitations

- No queueing built-in

## Related project(s)

- https://github.com/brodybits/aq-query-test-android

TBD others
