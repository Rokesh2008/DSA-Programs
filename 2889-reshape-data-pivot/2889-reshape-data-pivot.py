import pandas as pd

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    df = weather.pivot(
        index="month",
        columns="city",
        values="temperature"
    )

    df = df.rename_axis(None, axis=1)
    df = df.rename_axis("month")

    return df