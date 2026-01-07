export default function Feature({ room, price, amenities, handleBooking}) {

    return (
        <>
            <section className="feature">
                <img src="https://picsum.photos/360/450"></img>
                <div className="featureContent">
                    <div className="featureMain">
                        <p>{room}</p>
                        <p>${price} usd</p>
                        <button className="featureButton" onClick={handleBooking}>Book Today!</button>
                    </div>
                    <div className="featureAmenities">
                        {ShowAmenities(amenities)}
                    </div>
                </div>
            </section>
        </>
    )
}

function ShowAmenities(amenities) {
    
    return (
        <>
            <div className="amenityItem">
                <i className="fa-solid fa-umbrella-beach fa-2xl icon"></i>
                <span className="amenitiesText">Front Beach<span>{amenities[0]["Front Beach"]}</span></span>
            </div>
            <div className="amenityItem">
                <i className="fa-solid fa-hot-tub-person fa-2xl icon"></i>
                <span className="amenitiesText">Jacuzzi<span>{amenities[1]["Jacuzzi"]}</span></span>
            </div>
            <div className="amenityItem">
                <i className="fa-solid fa-bell-concierge fa-2xl icon"></i>
                <span className="amenitiesText">Concierge<span>{amenities[2]["Concierge"]}</span></span>
            </div>
        </>
    )
}