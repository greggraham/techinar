# Techinar: Machine Learning Starter

A beginner-friendly project for learning machine learning with Python, VS Code,
Jupyter notebooks, and [`uv`](https://docs.astral.sh/uv/). The first lesson uses
the Iris flower dataset bundled with scikit-learn, so no separate data download
is needed.

## What you need

- A computer running macOS, Windows, or Linux
- [Visual Studio Code](https://code.visualstudio.com/)
- [uv](https://docs.astral.sh/uv/getting-started/installation/)
- Python 3.13 (uv can install it for you)

## Get started

1. Clone or download this repository, then open its folder in VS Code.
2. In the VS Code terminal, run:

   ```sh
   uv sync
   ```

   This creates `.venv` and installs the exact versions recorded in `uv.lock`.
   If Python 3.13 is not installed, run `uv python install 3.13` and then
   `uv sync`.
3. Open `notebooks/first_ml_model.ipynb`.
4. If VS Code asks you to choose a kernel, select the project's `.venv`
   environment. If it is not listed, open the Command Palette, choose
   **Python: Select Interpreter**, and select `.venv/bin/python` on macOS/Linux
   or `.venv\Scripts\python.exe` on Windows. Then choose that environment as the
   notebook kernel.
5. Run the notebook cells from top to bottom.

The recommended VS Code extensions are Python, Jupyter, and Ruff. VS Code will
suggest them when this project is opened. Ruff checks Python files for common
mistakes and can format them. Internet access is needed to install uv, Python,
VS Code extensions, and project dependencies; the lesson dataset itself is
included with scikit-learn and does not require a separate download.

## Project contents

- `notebooks/first_ml_model.ipynb` — guided first classification lesson
- `src/techinar/` — Python package code for reusable examples
- `tests/` — quick setup and model smoke test
- `data/README.md` — dataset source, license, and data-file guidance
- `pyproject.toml` — project metadata and dependencies
- `uv.lock` — exact dependency versions; keep this file in Git

## Run the setup check

```sh
uv run pytest
```

## Check and format Python code

Ruff is installed in the project environment. Run these commands in the
integrated terminal:

```sh
uv run ruff check .
uv run ruff format .
```

The VS Code Ruff extension can also show lint messages and format Python files.
The repository's Ruff rules are intentionally small: common Python errors,
simple style checks, and import ordering.

## Troubleshooting

- **`uv` is not found:** install it using the [uv installation guide](https://docs.astral.sh/uv/getting-started/installation/), then restart the VS Code terminal.
- **No Python 3.13 available:** run `uv python install 3.13`, followed by `uv sync`.
- **Notebook cannot find a kernel:** run `uv sync`, then select the `.venv` Python interpreter and notebook kernel as described above.
- **A package import fails in a notebook:** make sure the selected kernel is this project's `.venv`, not a system or other project's Python.

## For the instructor

This repository can be used as a GitHub template so each student can create
their own copy. The project is licensed under the MIT License; see `LICENSE`.
The Iris dataset is attributed in `data/README.md`.