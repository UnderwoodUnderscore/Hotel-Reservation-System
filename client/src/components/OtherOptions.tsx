export default function OtherOptions({ name, desc }) {

    return (
        <>
            <div className="otherOption">
                <p className="name">{name} <i className="fa-solid fa-arrow-right"></i></p>
                <p className="desc">{desc[0]}</p>
                {name === "Call us" && <p className="number">{desc[1]}</p>}
            </div>
        </>
    )
}