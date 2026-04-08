# TODO: Complete agregarincidencia feature

## Steps:
- [x] 1. Edit serviceFix.java: Add `agregarincidencia(modeloincidencia inc)` method.
- [x] 2. Edit repositorioFix.java: Complete `agregarincidencia`, fix `eliminarincidencia` (by ID), `modificarincidencia` (by ID).
- [x] 3. Edit controllerFix.java: Fix `@PostMapping("/agregar")` to accept `@RequestBody modeloincidencia`, call service, return message.
- [x] 4. Edit modeloincidencia.java: Remove static `add`, add `toString()`, `equals()`, `hashCode()`.
- [x] 5. Test: Run `mvn spring-boot:run`, POST to /agregar with JSON.

Updated after each step.
lol